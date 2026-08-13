.class public final LC9/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LC9/k$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/X;)LC9/k;
    .locals 7

    const-string v0, "viewModelStore"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/V;->b:Landroidx/lifecycle/V$b;

    invoke-static {}, LC9/k;->h()Landroidx/lifecycle/V$c;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/V$b;->c(Landroidx/lifecycle/V$b;Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;ILjava/lang/Object;)Landroidx/lifecycle/V;

    move-result-object p1

    const-class v0, LC9/k;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/V;->a(LF7/c;)Landroidx/lifecycle/T;

    move-result-object p1

    check-cast p1, LC9/k;

    return-object p1
.end method
