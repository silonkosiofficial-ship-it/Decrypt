.class public final Lv/C;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;
.implements LF0/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/C$a;
    }
.end annotation


# static fields
.field public static final S:Lv/C$a;

.field public static final T:I


# instance fields
.field private P:Z

.field private final Q:Z

.field private R:LD0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv/C$a;-><init>(Ly7/k;)V

    sput-object v0, Lv/C;->S:Lv/C$a;

    const/16 v0, 0x8

    sput v0, Lv/C;->T:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method

.method private final T1()Lv/D;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lv/D;->R:Lv/D$a;

    invoke-static {p0, v0}, LF0/F0;->a(LF0/j;Ljava/lang/Object;)LF0/E0;

    move-result-object v0

    instance-of v2, v0, Lv/D;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Lv/D;

    :cond_0
    return-object v1
.end method

.method private final U1()V
    .locals 2

    .prologue
    iget-object v0, p0, Lv/C;->R:LD0/t;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lv/C;->T1()Lv/D;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lv/C;->R:LD0/t;

    invoke-virtual {v0, v1}, Lv/D;->T1(LD0/t;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public K()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv/C;->S:Lv/C$a;

    return-object v0
.end method

.method public final V1(Z)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lv/C;->P:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    invoke-direct {p0}, Lv/C;->T1()Lv/D;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv/D;->T1(LD0/t;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lv/C;->U1()V

    :cond_2
    :goto_0
    iput-boolean p1, p0, Lv/C;->P:Z

    return-void
.end method

.method public s(LD0/t;)V
    .locals 1

    .prologue
    iput-object p1, p0, Lv/C;->R:LD0/t;

    iget-boolean v0, p0, Lv/C;->P:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LD0/t;->K()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lv/C;->U1()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lv/C;->T1()Lv/D;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv/D;->T1(LD0/t;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lv/C;->Q:Z

    return v0
.end method
