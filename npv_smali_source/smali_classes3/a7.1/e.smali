.class public abstract La7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;


# instance fields
.field private final C:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La7/e;->C:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La7/e;->C:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d(Lm7/e;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end method
