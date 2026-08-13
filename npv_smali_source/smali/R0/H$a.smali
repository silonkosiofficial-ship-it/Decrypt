.class public final LR0/H$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/H;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final C:Ljava/lang/Object;

.field private final D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/H$a;->C:Ljava/lang/Object;

    iput-boolean p2, p0, LR0/H$a;->D:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-direct {p0, p1, p2}, LR0/H$a;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    iget-boolean v0, p0, LR0/H$a;->D:Z

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR0/H$a;->C:Ljava/lang/Object;

    return-object v0
.end method
