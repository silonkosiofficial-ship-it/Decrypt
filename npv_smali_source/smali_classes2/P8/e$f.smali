.class final LP8/e$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LP8/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/e$f;

    invoke-direct {v0}, LP8/e$f;-><init>()V

    sput-object v0, LP8/e$f;->D:LP8/e$f;

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
