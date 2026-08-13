.class public final LR0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LR0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LR0/D;->a()LR0/z;

    move-result-object v0

    iput-object v0, p0, LR0/v;->a:LR0/z;

    return-void
.end method


# virtual methods
.method public a(LR0/F;LR0/w;Lx7/l;Lx7/l;)LR0/H;
    .locals 1

    .prologue
    invoke-virtual {p1}, LR0/F;->c()LR0/h;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    instance-of p3, p2, LR0/f;

    :goto_0
    const/4 p4, 0x0

    if-eqz p3, :cond_1

    iget-object p2, p0, LR0/v;->a:LR0/z;

    invoke-virtual {p1}, LR0/F;->e()LR0/q;

    move-result-object p3

    invoke-virtual {p1}, LR0/F;->d()I

    move-result p1

    invoke-interface {p2, p3, p1}, LR0/z;->a(LR0/q;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p2, p2, LR0/u;

    if-eqz p2, :cond_2

    iget-object p2, p0, LR0/v;->a:LR0/z;

    invoke-virtual {p1}, LR0/F;->c()LR0/h;

    move-result-object p3

    check-cast p3, LR0/u;

    invoke-virtual {p1}, LR0/F;->e()LR0/q;

    move-result-object v0

    invoke-virtual {p1}, LR0/F;->d()I

    move-result p1

    invoke-interface {p2, p3, v0, p1}, LR0/z;->b(LR0/u;LR0/q;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_1
    new-instance p2, LR0/H$a;

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-direct {p2, p1, p3, v0, p4}, LR0/H$a;-><init>(Ljava/lang/Object;ZILy7/k;)V

    return-object p2

    :cond_2
    return-object p4
.end method
