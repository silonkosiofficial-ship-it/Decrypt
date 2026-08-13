.class public final LW/d$r;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "r"
.end annotation


# static fields
.field public static final c:LW/d$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$r;

    invoke-direct {v0}, LW/d$r;-><init>()V

    sput-object v0, LW/d$r;->c:LW/d$r;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, LW/d;-><init>(IIILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p2}, LW/d$q;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LW/e;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, LV/k1;->w0(I)V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, LW/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "offset"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LW/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
