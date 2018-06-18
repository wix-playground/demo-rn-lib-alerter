using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Alerter.RNAlerter
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAlerterModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAlerterModule"/>.
        /// </summary>
        internal RNAlerterModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAlerter";
            }
        }
    }
}
