.class public final enum Lj$/time/chrono/B;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lj$/time/chrono/k;


# static fields
.field public static final enum BEFORE_ROC:Lj$/time/chrono/B;

.field public static final enum ROC:Lj$/time/chrono/B;

.field private static final synthetic a:[Lj$/time/chrono/B;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    new-instance v2, Lj$/time/chrono/B;

    const-string v3, "BEFORE_ROC"

    invoke-direct {v2, v3, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lj$/time/chrono/B;->BEFORE_ROC:Lj$/time/chrono/B;

    new-instance v3, Lj$/time/chrono/B;

    const-string v4, "ROC"

    invoke-direct {v3, v4, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj$/time/chrono/B;->ROC:Lj$/time/chrono/B;

    const/4 v4, 0x2

    new-array v4, v4, [Lj$/time/chrono/B;

    aput-object v2, v4, v1

    aput-object v3, v4, v0

    sput-object v4, Lj$/time/chrono/B;->a:[Lj$/time/chrono/B;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj$/time/chrono/B;
    .locals 1

    const-class v0, Lj$/time/chrono/B;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj$/time/chrono/B;

    return-object p0
.end method

.method public static values()[Lj$/time/chrono/B;
    .locals 1

    sget-object v0, Lj$/time/chrono/B;->a:[Lj$/time/chrono/B;

    invoke-virtual {v0}, [Lj$/time/chrono/B;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj$/time/chrono/B;

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

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final synthetic n(Lj$/time/temporal/s;)I
    .locals 0

    invoke-static {p0, p1}, Lj$/time/chrono/g;->f(Lj$/time/chrono/k;Lj$/time/temporal/s;)I

    move-result p1

    return p1
.end method

.method public final q(Lj$/time/temporal/s;)Lj$/time/temporal/v;
    .locals 0

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

    invoke-virtual {p0}, Lj$/time/chrono/B;->getValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lj$/time/temporal/m;->c(JLj$/time/temporal/s;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method
