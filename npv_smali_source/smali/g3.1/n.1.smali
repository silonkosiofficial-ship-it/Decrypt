.class public final synthetic Lg3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/M$b;


# instance fields
.field public final synthetic a:Lg3/M;

.field public final synthetic b:LY2/p;


# direct methods
.method public synthetic constructor <init>(Lg3/M;LY2/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/n;->a:Lg3/M;

    iput-object p2, p0, Lg3/n;->b:LY2/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg3/n;->a:Lg3/M;

    iget-object v1, p0, Lg3/n;->b:LY2/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lg3/M;->R(Lg3/M;LY2/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
