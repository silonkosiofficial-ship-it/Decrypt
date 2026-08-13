.class public abstract Li9/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:Li9/x;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Li9/E$a;->D:Li9/E$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/E;->a:Li7/n;

    new-instance v0, Li9/x;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Li9/x;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    sput-object v0, Li9/E;->b:Li9/x;

    return-void
.end method

.method public static final synthetic a()Li9/x;
    .locals 1

    sget-object v0, Li9/E;->b:Li9/x;

    return-object v0
.end method

.method public static final b()Li9/D;
    .locals 1

    sget-object v0, Li9/E;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/D;

    return-object v0
.end method
