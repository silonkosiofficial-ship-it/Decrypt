.class public final Ll0/f;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/s;


# instance fields
.field private P:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Ll0/f;->P:Lx7/l;

    return-void
.end method


# virtual methods
.method public final T1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Ll0/f;->P:Lx7/l;

    return-void
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 1

    iget-object v0, p0, Ll0/f;->P:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lq0/c;->l1()V

    return-void
.end method
