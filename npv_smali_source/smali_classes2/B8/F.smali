.class public abstract LB8/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.coroutines.experimental.Continuation"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LB8/F;->a:Ln8/c;

    return-void
.end method

.method public static final synthetic a()Ln8/c;
    .locals 1

    sget-object v0, LB8/F;->a:Ln8/c;

    return-object v0
.end method
