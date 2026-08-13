.class public final synthetic Lg3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/M$b;


# instance fields
.field public final synthetic a:Lg3/M;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lb3/a$a;


# direct methods
.method public synthetic constructor <init>(Lg3/M;Ljava/lang/String;Ljava/util/Map;Lb3/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/s;->a:Lg3/M;

    iput-object p2, p0, Lg3/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lg3/s;->c:Ljava/util/Map;

    iput-object p4, p0, Lg3/s;->d:Lb3/a$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lg3/s;->a:Lg3/M;

    iget-object v1, p0, Lg3/s;->b:Ljava/lang/String;

    iget-object v2, p0, Lg3/s;->c:Ljava/util/Map;

    iget-object v3, p0, Lg3/s;->d:Lb3/a$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Lg3/M;->P0(Lg3/M;Ljava/lang/String;Ljava/util/Map;Lb3/a$a;Landroid/database/sqlite/SQLiteDatabase;)Lb3/a;

    move-result-object p1

    return-object p1
.end method
