import React from 'react';
import {requireNativeComponent, ViewProps} from 'react-native';

type NativeCounterProps = {
    text: string;
}

const NativeCounter = requireNativeComponent<NativeCounterProps>('NativeCounter');

type Props = NativeCounterProps & ViewProps;

const Counter: React.FC<Props> = (props: Props) => (
    <NativeCounter {...props}/>
);

export default Counter;
