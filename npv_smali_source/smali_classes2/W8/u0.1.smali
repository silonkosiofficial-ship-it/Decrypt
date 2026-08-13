.class final LW8/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/v0;


# instance fields
.field private final C:LW8/K0;


# direct methods
.method public constructor <init>(LW8/K0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/u0;->C:LW8/K0;

    return-void
.end method


# virtual methods
.method public a()LW8/K0;
    .locals 1

    iget-object v0, p0, LW8/u0;->C:LW8/K0;

    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
