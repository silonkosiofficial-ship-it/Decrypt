.class public final LK0/c;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/z0;


# instance fields
.field private P:Z

.field private Q:Z

.field private R:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-boolean p1, p0, LK0/c;->P:Z

    iput-boolean p2, p0, LK0/c;->Q:Z

    iput-object p3, p0, LK0/c;->R:Lx7/l;

    return-void
.end method


# virtual methods
.method public M0(LK0/w;)V
    .locals 1

    iget-object v0, p0, LK0/c;->R:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final T1(Z)V
    .locals 0

    iput-boolean p1, p0, LK0/c;->P:Z

    return-void
.end method

.method public final U1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LK0/c;->R:Lx7/l;

    return-void
.end method

.method public h0()Z
    .locals 1

    iget-boolean v0, p0, LK0/c;->Q:Z

    return v0
.end method

.method public k1()Z
    .locals 1

    iget-boolean v0, p0, LK0/c;->P:Z

    return v0
.end method
