.class final Ly8/n$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/n;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Ly8/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/n$b;

    invoke-direct {v0}, Ly8/n$b;-><init>()V

    sput-object v0, Ly8/n$b;->D:Ly8/n$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/a;)LO7/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/a;

    invoke-virtual {p0, p1}, Ly8/n$b;->a(LO7/a;)LO7/a;

    move-result-object p1

    return-object p1
.end method
