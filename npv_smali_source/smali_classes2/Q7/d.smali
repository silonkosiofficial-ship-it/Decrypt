.class public abstract LQ7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.internal.PlatformDependent"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ7/d;->a:Ln8/c;

    return-void
.end method

.method public static final a()Ln8/c;
    .locals 1

    sget-object v0, LQ7/d;->a:Ln8/c;

    return-object v0
.end method
