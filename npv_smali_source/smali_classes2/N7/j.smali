.class public abstract LN7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/f;

.field private static final b:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "getFirst"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LN7/j;->a:Ln8/f;

    const-string v0, "getLast"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LN7/j;->b:Ln8/f;

    return-void
.end method

.method public static final synthetic a()Ln8/f;
    .locals 1

    sget-object v0, LN7/j;->a:Ln8/f;

    return-object v0
.end method

.method public static final synthetic b()Ln8/f;
    .locals 1

    sget-object v0, LN7/j;->b:Ln8/f;

    return-object v0
.end method
