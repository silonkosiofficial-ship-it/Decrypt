.class public final LA/s;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/r0;


# instance fields
.field private P:Lh0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh0/c$b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, LA/s;->P:Lh0/c$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LA/s;->T1(LY0/e;Ljava/lang/Object;)LA/H;

    move-result-object p1

    return-object p1
.end method

.method public T1(LY0/e;Ljava/lang/Object;)LA/H;
    .locals 7

    .prologue
    instance-of p1, p2, LA/H;

    if-eqz p1, :cond_0

    check-cast p2, LA/H;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, LA/H;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, LA/H;-><init>(FZLA/n;LA/r;ILy7/k;)V

    :cond_1
    sget-object p1, LA/n;->a:LA/n$b;

    iget-object v0, p0, LA/s;->P:Lh0/c$b;

    invoke-virtual {p1, v0}, LA/n$b;->a(Lh0/c$b;)LA/n;

    move-result-object p1

    invoke-virtual {p2, p1}, LA/H;->e(LA/n;)V

    return-object p2
.end method

.method public final U1(Lh0/c$b;)V
    .locals 0

    iput-object p1, p0, LA/s;->P:Lh0/c$b;

    return-void
.end method
