.class public enum LX7/I$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/I$c$a;
    }
.end annotation


# static fields
.field public static final enum D:LX7/I$c;

.field public static final enum E:LX7/I$c;

.field public static final enum F:LX7/I$c;

.field public static final enum G:LX7/I$c;

.field private static final synthetic H:[LX7/I$c;

.field private static final synthetic I:Lp7/a;


# instance fields
.field private final C:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LX7/I$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "NULL"

    invoke-direct {v0, v3, v1, v2}, LX7/I$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LX7/I$c;->D:LX7/I$c;

    new-instance v0, LX7/I$c;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "INDEX"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LX7/I$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LX7/I$c;->E:LX7/I$c;

    new-instance v0, LX7/I$c;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "FALSE"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, LX7/I$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LX7/I$c;->F:LX7/I$c;

    new-instance v0, LX7/I$c$a;

    const-string v1, "MAP_GET_OR_DEFAULT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LX7/I$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LX7/I$c;->G:LX7/I$c;

    invoke-static {}, LX7/I$c;->e()[LX7/I$c;

    move-result-object v0

    sput-object v0, LX7/I$c;->H:[LX7/I$c;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LX7/I$c;->I:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LX7/I$c;->C:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Object;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LX7/I$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final synthetic e()[LX7/I$c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LX7/I$c;

    sget-object v1, LX7/I$c;->D:LX7/I$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX7/I$c;->E:LX7/I$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LX7/I$c;->F:LX7/I$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LX7/I$c;->G:LX7/I$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX7/I$c;
    .locals 1

    const-class v0, LX7/I$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX7/I$c;

    return-object p0
.end method

.method public static values()[LX7/I$c;
    .locals 1

    sget-object v0, LX7/I$c;->H:[LX7/I$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX7/I$c;

    return-object v0
.end method
