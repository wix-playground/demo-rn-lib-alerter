
import { NativeModules, StyleSheet } from 'react-native';

const { RNAlerter } = NativeModules;

export const alert = RNAlerter.alert;


import React, { Component } from 'react'
import { View, requireNativeComponent } from 'react-native'

export class AlerterView extends Component {
  render() {
    return (
      <View>
        <RNTAlerterView style={{height: 38}}/>
      </View>
    )
  }
};

AlerterView.propTypes = {
  ...View.propTypes
};

const RNTAlerterView = requireNativeComponent('RNAlerterView', AlerterView);
