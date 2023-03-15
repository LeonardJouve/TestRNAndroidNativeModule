import React from 'react';
import {
    Text,
    View,
} from 'react-native';
import NativeCounter from './NativeCounter';

function App(): JSX.Element {
    return (
        <View>
            <Text>{'test'}</Text>
            <NativeCounter text='test'/>
        </View>
    );
}

export default App;
