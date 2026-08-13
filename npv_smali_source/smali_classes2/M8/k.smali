.class public abstract LM8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/k$a;,
        LM8/k$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/k;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LM8/k;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(LO7/y;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LM8/f$a;->a(LM8/f;LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM8/k;->a:Ljava/lang/String;

    return-object v0
.end method
