.class public abstract LS/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE7/i;

.field private final b:LT/f;

.field private final c:LV/w0;

.field private d:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;LE7/i;LS/P0;Ljava/util/Locale;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LS/h;->a:LE7/i;

    invoke-static {p4}, LT/i;->a(Ljava/util/Locale;)LT/f;

    move-result-object p4

    iput-object p4, p0, LS/h;->b:LT/f;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p3, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LS/h;->c:LV/w0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p4, v2, v3}, LT/f;->g(J)LT/j;

    move-result-object p1

    invoke-virtual {p1}, LT/j;->e()I

    move-result p3

    invoke-virtual {p2, p3}, LE7/i;->D(I)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "The initial display month\'s year ("

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LT/j;->e()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of the years range of "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-virtual {p4}, LT/f;->i()LT/e;

    move-result-object p1

    invoke-virtual {p4, p1}, LT/f;->h(LT/e;)LT/j;

    move-result-object p1

    :goto_0
    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LS/h;->d:LV/w0;

    return-void
.end method


# virtual methods
.method public final c(J)V
    .locals 1

    .prologue
    iget-object v0, p0, LS/h;->b:LT/f;

    invoke-virtual {v0, p1, p2}, LT/f;->g(J)LT/j;

    move-result-object p1

    iget-object p2, p0, LS/h;->a:LE7/i;

    invoke-virtual {p1}, LT/j;->e()I

    move-result v0

    invoke-virtual {p2, v0}, LE7/i;->D(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LS/h;->d:LV/w0;

    invoke-interface {p2, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The display month\'s year ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LT/j;->e()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of the years range of "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LS/h;->a:LE7/i;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final d()LS/P0;
    .locals 1

    iget-object v0, p0, LS/h;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/P0;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-object v0, p0, LS/h;->d:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/j;

    invoke-virtual {v0}, LT/j;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()LE7/i;
    .locals 1

    iget-object v0, p0, LS/h;->a:LE7/i;

    return-object v0
.end method

.method public final i()LT/f;
    .locals 1

    iget-object v0, p0, LS/h;->b:LT/f;

    return-object v0
.end method

.method public final j(LS/P0;)V
    .locals 1

    iget-object v0, p0, LS/h;->c:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
