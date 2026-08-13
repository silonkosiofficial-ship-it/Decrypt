.class public final Lv/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/W;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/Y$a;
    }
.end annotation


# static fields
.field public static final b:Lv/Y;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/Y;

    invoke-direct {v0}, Lv/Y;-><init>()V

    sput-object v0, Lv/Y;->b:Lv/Y;

    const/4 v0, 0x1

    sput-boolean v0, Lv/Y;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Lv/Y;->c:Z

    return v0
.end method

.method public bridge synthetic b(Landroid/view/View;ZJFFZLY0/e;F)Lv/V;
    .locals 0

    invoke-virtual/range {p0 .. p9}, Lv/Y;->c(Landroid/view/View;ZJFFZLY0/e;F)Lv/Y$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/View;ZJFFZLY0/e;F)Lv/Y$a;
    .locals 2

    .prologue
    if-eqz p2, :cond_0

    new-instance p2, Lv/Y$a;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Lv/Y$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2

    :cond_0
    invoke-interface {p8, p3, p4}, LY0/e;->b1(J)J

    move-result-wide p2

    invoke-interface {p8, p5}, LY0/e;->B0(F)F

    move-result p4

    invoke-interface {p8, p6}, LY0/e;->B0(F)F

    move-result p5

    new-instance p6, Landroid/widget/Magnifier$Builder;

    invoke-direct {p6, p1}, Landroid/widget/Magnifier$Builder;-><init>(Landroid/view/View;)V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result p2

    invoke-static {p2}, LA7/a;->d(F)I

    move-result p2

    invoke-virtual {p6, p1, p2}, Landroid/widget/Magnifier$Builder;->setSize(II)Landroid/widget/Magnifier$Builder;

    :cond_1
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p6, p4}, Landroid/widget/Magnifier$Builder;->setCornerRadius(F)Landroid/widget/Magnifier$Builder;

    :cond_2
    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p6, p5}, Landroid/widget/Magnifier$Builder;->setElevation(F)Landroid/widget/Magnifier$Builder;

    :cond_3
    invoke-static {p9}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p6, p9}, Landroid/widget/Magnifier$Builder;->setInitialZoom(F)Landroid/widget/Magnifier$Builder;

    :cond_4
    invoke-virtual {p6, p7}, Landroid/widget/Magnifier$Builder;->setClippingEnabled(Z)Landroid/widget/Magnifier$Builder;

    invoke-virtual {p6}, Landroid/widget/Magnifier$Builder;->build()Landroid/widget/Magnifier;

    move-result-object p1

    new-instance p2, Lv/Y$a;

    invoke-direct {p2, p1}, Lv/Y$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method
