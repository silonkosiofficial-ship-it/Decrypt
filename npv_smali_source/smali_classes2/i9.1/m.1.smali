.class public abstract Li9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lk9/q;

.field private static final b:Li9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v7, Lk9/q;

    new-instance v1, Lk9/x;

    sget-object v0, Li9/m$a;->K:Li9/m$a;

    invoke-direct {v1, v0}, Lk9/x;-><init>(LF7/i;)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lk9/q;-><init>(Lk9/b;Ljava/lang/String;Ljava/lang/Object;Lk9/m;ILy7/k;)V

    sput-object v7, Li9/m;->a:Lk9/q;

    new-instance v0, Li9/k;

    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Li9/k;-><init>(Li9/v;Li9/x;Li9/y;Ljava/lang/String;ILy7/k;)V

    sput-object v0, Li9/m;->b:Li9/k;

    return-void
.end method

.method public static final synthetic a()Li9/k;
    .locals 1

    sget-object v0, Li9/m;->b:Li9/k;

    return-object v0
.end method

.method public static final b()Lk9/q;
    .locals 1

    sget-object v0, Li9/m;->a:Lk9/q;

    return-object v0
.end method
