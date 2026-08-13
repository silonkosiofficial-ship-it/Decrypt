.class public final enum Lj$/time/chrono/p;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lj$/time/chrono/k;


# static fields
.field public static final enum AH:Lj$/time/chrono/p;

.field private static final synthetic a:[Lj$/time/chrono/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-instance v1, Lj$/time/chrono/p;

    const-string v2, "AH"

    invoke-direct {v1, v2, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj$/time/chrono/p;->AH:Lj$/time/chrono/p;

    const/4 v2, 0x1

    new-array v2, v2, [Lj$/time/chrono/p;

    aput-object v1, v2, v0

    sput-object v2, Lj$/time/chrono/p;->a:[Lj$/time/chrono/p;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj$/time/chrono/p;
    .locals 1

    const-class v0, Lj$/time/chrono/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj$/time/chrono/p;

    return-object p0
.end method

.method public static values()[Lj$/time/chrono/p;
    .locals 1

    sget-object v0, Lj$/time/chrono/p;->a:[Lj$/time/chrono/p;

    invoke-virtual {v0}, [Lj$/time/chrono/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj$/time/chrono/p;

    return-object v0
.end method


# virtual methods
.method public final synthetic e(Lj$/time/temporal/s;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/time/chrono/g;->i(Lj$/time/chrono/k;Lj$/time/temporal/s;)Z

    move-result p1

    return p1
.end method

.method public final getValue()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic n(Lj$/time/temporal/s;)I
    .locals 0

    invoke-static {p0, p1}, Lj$/time/chrono/g;->f(Lj$/time/chrono/k;Lj$/time/temporal/s;)I

    move-result p1

    return p1
.end method

.method public final q(Lj$/time/temporal/s;)Lj$/time/temporal/v;
    .locals 2

    .prologue
    sget-object v0, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0x1

    invoke-static {v0, v1, v0, v1}, Lj$/time/temporal/v;->j(JJ)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0, p1}, Lj$/time/temporal/n;->d(Lj$/time/temporal/TemporalAccessor;Lj$/time/temporal/s;)Lj$/time/temporal/v;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic u(Lj$/time/temporal/s;)J
    .locals 2

    invoke-static {p0, p1}, Lj$/time/chrono/g;->g(Lj$/time/chrono/k;Lj$/time/temporal/s;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic x(Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lj$/time/chrono/g;->m(Lj$/time/chrono/k;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lj$/time/temporal/m;)Lj$/time/temporal/m;
    .locals 3

    sget-object v0, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    const/4 v1, 0x1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->c(JLj$/time/temporal/s;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method
