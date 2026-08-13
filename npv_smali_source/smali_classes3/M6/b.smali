.class public final LM6/b;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# instance fields
.field private final C:LQ6/c;

.field private final D:Ljava/lang/Throwable;

.field private final E:Ljava/lang/String;


# direct methods
.method public constructor <init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    iput-object p1, p0, LM6/b;->C:LQ6/c;

    iput-object p2, p0, LM6/b;->D:Ljava/lang/Throwable;

    iput-object p3, p0, LM6/b;->E:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, LM6/b;-><init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, LM6/b;->D:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM6/b;->E:Ljava/lang/String;

    return-object v0
.end method
