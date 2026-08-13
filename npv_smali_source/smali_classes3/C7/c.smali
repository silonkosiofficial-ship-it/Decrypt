.class public abstract LC7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC7/c$a;
    }
.end annotation


# static fields
.field public static final C:LC7/c$a;

.field private static final D:LC7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC7/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC7/c$a;-><init>(Ly7/k;)V

    sput-object v0, LC7/c;->C:LC7/c$a;

    sget-object v0, Lq7/b;->a:Lq7/a;

    invoke-virtual {v0}, Lq7/a;->b()LC7/c;

    move-result-object v0

    sput-object v0, LC7/c;->D:LC7/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LC7/c;
    .locals 1

    sget-object v0, LC7/c;->D:LC7/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c(I)I
.end method
