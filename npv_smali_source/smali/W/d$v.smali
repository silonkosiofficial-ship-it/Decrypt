.class public final LW/d$v;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "v"
.end annotation


# static fields
.field public static final c:LW/d$v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$v;

    invoke-direct {v0}, LW/d$v;-><init>()V

    sput-object v0, LW/d$v;->c:LW/d$v;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v0, v1}, LW/d;-><init>(IIILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p2}, LW/d$t;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/Z0;

    invoke-interface {p4, p1}, LV/Y0;->d(LV/Z0;)V

    return-void
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "value"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LW/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
