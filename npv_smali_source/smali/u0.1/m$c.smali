.class final Lu0/m$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/m;-><init>(Lu0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu0/m$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu0/m$c;

    invoke-direct {v0}, Lu0/m$c;-><init>()V

    sput-object v0, Lu0/m$c;->D:Lu0/m$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu0/m$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
