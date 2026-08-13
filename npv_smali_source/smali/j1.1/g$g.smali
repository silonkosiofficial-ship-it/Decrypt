.class public final enum Lj1/g$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/g$g$a;
    }
.end annotation


# static fields
.field public static final C:Lj1/g$g$a;

.field private static final D:Ljava/util/Map;

.field private static final E:Ljava/util/Map;

.field public static final enum F:Lj1/g$g;

.field public static final enum G:Lj1/g$g;

.field public static final enum H:Lj1/g$g;

.field private static final synthetic I:[Lj1/g$g;

.field private static final synthetic J:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lj1/g$g;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj1/g$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$g;->F:Lj1/g$g;

    new-instance v1, Lj1/g$g;

    const-string v3, "CHAIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj1/g$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj1/g$g;->G:Lj1/g$g;

    new-instance v3, Lj1/g$g;

    const-string v5, "ALIGNED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj1/g$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj1/g$g;->H:Lj1/g$g;

    invoke-static {}, Lj1/g$g;->e()[Lj1/g$g;

    move-result-object v5

    sput-object v5, Lj1/g$g;->I:[Lj1/g$g;

    invoke-static {v5}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v5

    sput-object v5, Lj1/g$g;->J:Lp7/a;

    new-instance v5, Lj1/g$g$a;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lj1/g$g$a;-><init>(Ly7/k;)V

    sput-object v5, Lj1/g$g;->C:Lj1/g$g$a;

    const-string v5, "none"

    invoke-static {v5, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const-string v7, "chain"

    invoke-static {v7, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    const-string v8, "aligned"

    invoke-static {v8, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const/4 v9, 0x3

    new-array v10, v9, [Li7/u;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    invoke-static {v10}, Lj7/S;->j([Li7/u;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lj1/g$g;->D:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v5, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v8, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    new-array v5, v9, [Li7/u;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    invoke-static {v5}, Lj7/S;->j([Li7/u;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lj1/g$g;->E:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lj1/g$g;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lj1/g$g;

    sget-object v1, Lj1/g$g;->F:Lj1/g$g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$g;->G:Lj1/g$g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$g;->H:Lj1/g$g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final synthetic g()Ljava/util/Map;
    .locals 1

    sget-object v0, Lj1/g$g;->E:Ljava/util/Map;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj1/g$g;
    .locals 1

    const-class v0, Lj1/g$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj1/g$g;

    return-object p0
.end method

.method public static values()[Lj1/g$g;
    .locals 1

    sget-object v0, Lj1/g$g;->I:[Lj1/g$g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj1/g$g;

    return-object v0
.end method
