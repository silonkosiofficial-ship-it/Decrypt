.class public abstract Li9/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:Li9/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Li9/C$a;->D:Li9/C$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/C;->a:Li7/n;

    new-instance v0, Li9/w;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Li9/w;-><init>(Li9/v;Li9/x;ILy7/k;)V

    sput-object v0, Li9/C;->b:Li9/w;

    return-void
.end method

.method public static final synthetic a()Li9/w;
    .locals 1

    sget-object v0, Li9/C;->b:Li9/w;

    return-object v0
.end method

.method public static final b()Li9/B;
    .locals 1

    sget-object v0, Li9/C;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/B;

    return-object v0
.end method
