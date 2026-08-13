.class LC1/E$b;
.super LC1/E$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC1/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(LC1/E;)V
    .locals 0

    invoke-direct {p0, p1}, LC1/E$a;-><init>(LC1/E;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LC1/E$a;->a:LC1/E;

    invoke-static {p2}, LC1/B;->b1(Landroid/view/accessibility/AccessibilityNodeInfo;)LC1/B;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, LC1/E;->a(ILC1/B;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
