.class final Laa/o$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/o$b;

    invoke-direct {v0}, Laa/o$b;-><init>()V

    sput-object v0, Laa/o$b;->D:Laa/o$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Laa/b;
    .locals 1

    invoke-static {}, Laa/o;->d()Laa/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/o$b;->a()Laa/b;

    move-result-object v0

    return-object v0
.end method
