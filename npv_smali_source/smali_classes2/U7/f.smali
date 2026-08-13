.class public abstract LU7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU7/f$a;
    }
.end annotation


# static fields
.field public static final b:LU7/f$a;


# instance fields
.field private final a:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU7/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU7/f$a;-><init>(Ly7/k;)V

    sput-object v0, LU7/f;->b:LU7/f$a;

    return-void
.end method

.method private constructor <init>(Ln8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU7/f;->a:Ln8/f;

    return-void
.end method

.method public synthetic constructor <init>(Ln8/f;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LU7/f;-><init>(Ln8/f;)V

    return-void
.end method


# virtual methods
.method public getName()Ln8/f;
    .locals 1

    iget-object v0, p0, LU7/f;->a:Ln8/f;

    return-object v0
.end method
