import {NativeModules} from 'react-native';

const {NativeToaster} = NativeModules;

type Toaster = {
    toast(message: string, duration: number): void;
}

export default NativeToaster as Toaster;
