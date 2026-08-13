.class final Lb8/j$m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/j;->L(Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lb8/j$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/j$m;

    invoke-direct {v0}, Lb8/j$m;-><init>()V

    sput-object v0, Lb8/j$m;->D:Lb8/j$m;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/Z;)LO7/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/Z;

    invoke-virtual {p0, p1}, Lb8/j$m;->a(LO7/Z;)LO7/a;

    move-result-object p1

    return-object p1
.end method
