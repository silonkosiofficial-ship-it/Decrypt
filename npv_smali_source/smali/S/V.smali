.class final LS/V;
.super LS/h;
.source "SourceFile"

# interfaces
.implements LS/U;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/V$a;
    }
.end annotation


# static fields
.field public static final g:LS/V$a;


# instance fields
.field private e:LV/w0;

.field private f:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/V$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS/V$a;-><init>(Ly7/k;)V

    sput-object v0, LS/V;->g:LS/V$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;)V
    .locals 2

    .prologue
    invoke-direct {p0, p2, p3, p5, p6}, LS/h;-><init>(Ljava/lang/Long;LE7/i;LS/P0;Ljava/util/Locale;)V

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LS/h;->i()LT/f;

    move-result-object p5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, LT/f;->b(J)LT/e;

    move-result-object p1

    invoke-virtual {p1}, LT/e;->m()I

    move-result p5

    invoke-virtual {p3, p5}, LE7/i;->D(I)Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "The provided initial date\'s year ("

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LT/e;->m()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of the years range of "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    move-object p1, p2

    :goto_0
    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LS/V;->e:LV/w0;

    invoke-static {p4}, LS/Y;->c(I)LS/Y;

    move-result-object p1

    invoke-static {p1, p2, p3, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LS/V;->f:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LS/V;-><init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LS/V;->f()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, LS/h;->i()LT/f;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, LT/f;->g(J)LT/j;

    move-result-object v0

    invoke-virtual {v0}, LT/j;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LS/h;->c(J)V

    :cond_0
    iget-object v0, p0, LS/V;->f:LV/w0;

    invoke-static {p1}, LS/Y;->c(I)LS/Y;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LS/V;->f:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/Y;

    invoke-virtual {v0}, LS/Y;->i()I

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/Long;
    .locals 2

    .prologue
    iget-object v0, p0, LS/V;->e:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT/e;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public h(Ljava/lang/Long;)V
    .locals 3

    .prologue
    if-eqz p1, :cond_1

    invoke-virtual {p0}, LS/h;->i()LT/f;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LT/f;->b(J)LT/e;

    move-result-object p1

    invoke-virtual {p0}, LS/h;->g()LE7/i;

    move-result-object v0

    invoke-virtual {p1}, LT/e;->m()I

    move-result v1

    invoke-virtual {v0, v1}, LE7/i;->D(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LS/V;->e:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The provided date\'s year ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LT/e;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of the years range of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LS/h;->g()LE7/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object p1, p0, LS/V;->e:LV/w0;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LV/w0;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
