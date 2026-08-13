.class final Le0/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Le0/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le0/k$b;

    invoke-direct {v0}, Le0/k$b;-><init>()V

    sput-object v0, Le0/k$b;->D:Le0/k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method
