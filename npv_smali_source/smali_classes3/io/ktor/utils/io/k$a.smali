.class public final Lio/ktor/utils/io/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/ktor/utils/io/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final C:Lm7/i;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm7/j;->C:Lm7/j;

    iput-object v0, p0, Lio/ktor/utils/io/k$a;->C:Lm7/i;

    return-void
.end method


# virtual methods
.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/k$a;->C:Lm7/i;

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
