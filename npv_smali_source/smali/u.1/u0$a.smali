.class final Lu/u0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/u0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/u0$a;

    invoke-direct {v0}, Lu/u0$a;-><init>()V

    sput-object v0, Lu/u0$a;->D:Lu/u0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lf0/u;
    .locals 2

    new-instance v0, Lf0/u;

    sget-object v1, Lu/u0$a$a;->D:Lu/u0$a$a;

    invoke-direct {v0, v1}, Lf0/u;-><init>(Lx7/l;)V

    invoke-virtual {v0}, Lf0/u;->s()V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/u0$a;->a()Lf0/u;

    move-result-object v0

    return-object v0
.end method
