.class public abstract LR0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LR0/G;

.field private static final b:LR0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/G;

    invoke-direct {v0}, LR0/G;-><init>()V

    sput-object v0, LR0/k;->a:LR0/G;

    new-instance v0, LR0/e;

    invoke-direct {v0}, LR0/e;-><init>()V

    sput-object v0, LR0/k;->b:LR0/e;

    return-void
.end method

.method public static final a()LR0/e;
    .locals 1

    sget-object v0, LR0/k;->b:LR0/e;

    return-object v0
.end method

.method public static final b()LR0/G;
    .locals 1

    sget-object v0, LR0/k;->a:LR0/G;

    return-object v0
.end method
