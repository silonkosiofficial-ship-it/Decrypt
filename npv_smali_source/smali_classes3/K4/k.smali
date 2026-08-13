.class public final LK4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK4/j;


# static fields
.field private static final b:LK4/k;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LK4/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK4/k;-><init>(Ljava/lang/Object;)V

    sput-object v0, LK4/k;->b:LK4/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK4/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/Object;)LK4/j;
    .locals 1

    .prologue
    new-instance v0, LK4/k;

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, LK4/k;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "instance cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK4/k;->a:Ljava/lang/Object;

    return-object v0
.end method
