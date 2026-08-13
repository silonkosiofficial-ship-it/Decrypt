.class public abstract LN/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;

.field private static final b:J

.field private static final c:LN/J;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, LN/K$a;->D:LN/K$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, LN/K;->a:LV/O0;

    const-wide v0, 0xff4286f4L

    invoke-static {v0, v1}, Lo0/A0;->d(J)J

    move-result-wide v0

    sput-wide v0, LN/K;->b:J

    new-instance v10, LN/J;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3ecccccd    # 0.4f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, v0

    invoke-static/range {v2 .. v9}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v10

    move-wide v3, v0

    invoke-direct/range {v2 .. v7}, LN/J;-><init>(JJLy7/k;)V

    sput-object v10, LN/K;->c:LN/J;

    return-void
.end method

.method public static final synthetic a()LN/J;
    .locals 1

    sget-object v0, LN/K;->c:LN/J;

    return-object v0
.end method

.method public static final b()LV/O0;
    .locals 1

    sget-object v0, LN/K;->a:LV/O0;

    return-object v0
.end method
