#import "RNAlerter.h"
#import <UIKit/UIKit.h>
#import <Foundation/Foundation.h>

@implementation RNAlerter

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(alert:(NSString *)title msg:(NSString *)msg)
{
    UIAlertView *alert = [[UIAlertView alloc] initWithTitle:title
                                                    message:msg
                                                   delegate:self
                                          cancelButtonTitle:@"Cancel"
                                          otherButtonTitles:nil];
    [alert show];
}

@end
