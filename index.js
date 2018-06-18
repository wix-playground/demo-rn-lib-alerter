
import { NativeModules } from 'react-native';

const { RNAlerter } = NativeModules;

export const alert = RNAlerter.alert;
