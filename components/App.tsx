import React, {useState} from 'react';
import {
    Button,
    StyleSheet,
    View,
} from 'react-native';
import Toaster from '../modules/Toaster';
import Counter from './Counter';

function App(): JSX.Element {
    const [test, setTest] = useState('test');
    const onPress = () => {
        setTest(test + 'test');
        Toaster.toast(test, 2000);
    };
    return (
        <View style={style.wrapper}>
            <Button
                title='update text'
                onPress={onPress}
            />
            <Counter
                style={style.nativeCounter}
                text={test}
            />
        </View>
    );
}

const style = StyleSheet.create({
    wrapper: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
    },
    nativeCounter: {
        flex: 1,
        width: '100%',
        height: '100%',
    },
});

export default App;
