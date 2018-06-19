#import <Foundation/Foundation.h>
#import <MapKit/MapKit.h>

#import <React/RCTViewManager.h>

@interface RNAlerterViewManager : RCTViewManager
@end

@implementation RNAlerterViewManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
    UIButton *btn = [[UIButton alloc] init];
    [btn setTitle:@"BTN" forState:UIControlStateNormal];
    [btn setTitleColor:[UIColor blueColor] forState:UIControlStateNormal];
    [btn setTitleColor:[UIColor blackColor] forState:UIControlStateHighlighted];
    return btn;
}

@end
