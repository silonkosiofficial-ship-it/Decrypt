.class public abstract LM8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/g$a;,
        LM8/g$b;,
        LM8/g$c;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LM8/g;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LM8/g;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LM8/g;->a:Z

    return v0
.end method
