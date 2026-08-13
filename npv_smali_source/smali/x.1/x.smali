.class public final Lx/x;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/x$a;
    }
.end annotation


# static fields
.field public static final R:Lx/x$a;

.field public static final S:I


# instance fields
.field private final P:Ljava/lang/Object;

.field private Q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx/x$a;-><init>(Ly7/k;)V

    sput-object v0, Lx/x;->R:Lx/x$a;

    const/16 v0, 0x8

    sput v0, Lx/x;->S:I

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    sget-object v0, Lx/x;->R:Lx/x$a;

    iput-object v0, p0, Lx/x;->P:Ljava/lang/Object;

    iput-boolean p1, p0, Lx/x;->Q:Z

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx/x;->P:Ljava/lang/Object;

    return-object v0
.end method

.method public final T1()Z
    .locals 1

    iget-boolean v0, p0, Lx/x;->Q:Z

    return v0
.end method

.method public final U1(Z)V
    .locals 0

    iput-boolean p1, p0, Lx/x;->Q:Z

    return-void
.end method
