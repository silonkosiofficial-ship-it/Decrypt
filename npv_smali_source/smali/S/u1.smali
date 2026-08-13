.class final LS/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS/t1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/u1$a;
    }
.end annotation


# static fields
.field public static final f:LS/u1$a;


# instance fields
.field private a:Z

.field private final b:LV/w0;

.field private final c:LV/w0;

.field private final d:LV/s0;

.field private final e:LV/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/u1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS/u1$a;-><init>(Ly7/k;)V

    sput-object v0, LS/u1;->f:LS/u1$a;

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_2

    const/16 v0, 0x18

    if-ge p1, v0, :cond_2

    if-ltz p2, :cond_1

    const/16 v0, 0x3c

    if-ge p2, v0, :cond_1

    iput-boolean p3, p0, LS/u1;->a:Z

    sget-object p3, LS/s1;->b:LS/s1$a;

    invoke-virtual {p3}, LS/s1$a;->a()I

    move-result p3

    invoke-static {p3}, LS/s1;->c(I)LS/s1;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p3, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LS/u1;->b:LV/w0;

    const/16 p3, 0xc

    if-lt p1, p3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LS/u1;->c:LV/w0;

    rem-int/2addr p1, p3

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, LS/u1;->d:LV/s0;

    invoke-static {p2}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, LS/u1;->e:LV/s0;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "initialMinute should be in [0..59] range"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "initialHour should in [0..23] range"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LS/u1;->e:LV/s0;

    invoke-interface {v0}, LV/s0;->d()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 2

    .prologue
    iget-object v0, p0, LS/u1;->d:LV/s0;

    invoke-interface {v0}, LV/s0;->d()I

    move-result v0

    invoke-virtual {p0}, LS/u1;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, LS/u1;->c:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public d(I)V
    .locals 2

    .prologue
    const/16 v0, 0xc

    if-lt p1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1}, LS/u1;->c(Z)V

    iget-object v1, p0, LS/u1;->d:LV/s0;

    rem-int/2addr p1, v0

    invoke-interface {v1, p1}, LV/s0;->i(I)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, LS/u1;->e:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, LS/u1;->b:LV/w0;

    invoke-static {p1}, LS/s1;->c(I)LS/s1;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LS/u1;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/s1;

    invoke-virtual {v0}, LS/s1;->i()I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LS/u1;->a:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, LS/u1;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
