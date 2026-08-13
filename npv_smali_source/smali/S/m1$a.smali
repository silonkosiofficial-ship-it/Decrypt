.class final LS/m1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/m1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/m1$a;

    invoke-direct {v0}, LS/m1$a;-><init>()V

    sput-object v0, LS/m1$a;->D:LS/m1$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LM0/P;
    .locals 1

    invoke-static {}, LU/N;->a()LM0/P;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/m1$a;->a()LM0/P;

    move-result-object v0

    return-object v0
.end method
