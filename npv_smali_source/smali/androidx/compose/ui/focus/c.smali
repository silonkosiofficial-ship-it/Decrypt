.class final Landroidx/compose/ui/focus/c;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lm0/b;


# instance fields
.field private P:Lx7/l;

.field private Q:Lm0/n;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->P:Lx7/l;

    return-void
.end method


# virtual methods
.method public R0(Lm0/n;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/focus/c;->Q:Lm0/n;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->Q:Lm0/n;

    iget-object v0, p0, Landroidx/compose/ui/focus/c;->P:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final T1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->P:Lx7/l;

    return-void
.end method
