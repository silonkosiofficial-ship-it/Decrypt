.class public abstract LY6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/TimeZone;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "GMT"

    invoke-static {v0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, LY6/a;->a:Ljava/util/TimeZone;

    return-void
.end method

.method public static final a(Ljava/lang/Long;)LY6/b;
    .locals 2

    sget-object v0, LY6/a;->a:Ljava/util/TimeZone;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, p0}, LY6/a;->c(Ljava/util/Calendar;Ljava/lang/Long;)LY6/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Long;ILjava/lang/Object;)LY6/b;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LY6/a;->a(Ljava/lang/Long;)LY6/b;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/Calendar;Ljava/lang/Long;)LY6/b;
    .locals 13

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    :cond_0
    const/16 p1, 0xf

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/2addr p1, v0

    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v5, 0x5

    add-int/2addr v1, v5

    rem-int/2addr v1, v0

    sget-object v0, LY6/d;->D:LY6/d$a;

    invoke-virtual {v0, v1}, LY6/d$a;->a(I)LY6/d;

    move-result-object v0

    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v7

    sget-object v1, LY6/c;->D:LY6/c$a;

    const/4 v5, 0x2

    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-virtual {v1, v5}, LY6/c$a;->a(I)LY6/c;

    move-result-object v8

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v9

    new-instance v12, LY6/b;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    int-to-long p0, p1

    add-long/2addr v10, p0

    move-object v1, v12

    move-object v5, v0

    invoke-direct/range {v1 .. v11}, LY6/b;-><init>(IIILY6/d;IILY6/c;IJ)V

    return-object v12
.end method
